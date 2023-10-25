package org.DenWorker.Java_Core._4_I_O_File_System_Access._4_4_Advanced_Features;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Task_4_4_9 {
    public static final String AUSTIN_POWERS = "Austin Powers";
    public static final String WEAPONS = "weapons";
    public static final String BANNED_SUBSTANCE = "banned substance";

    public static void main(String[] args) {
        System.out.println("gg");
    }

    public static interface Sendable {
        String getFrom();

        String getTo();
    }

    public static interface MailService {
        Sendable processMail(Sendable mail);
    }

    /////////////////////////////////////////////////////////////////////////////////////////

    public static abstract class AbstractSendable implements Sendable {

        protected final String from;
        protected final String to;

        public AbstractSendable(String from, String to) {
            this.from = from;
            this.to = to;
        }

        @Override
        public String getFrom() {
            return from;
        }

        @Override
        public String getTo() {
            return to;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AbstractSendable that = (AbstractSendable) o;

            if (!from.equals(that.from)) return false;
            if (!to.equals(that.to)) return false;

            return true;
        }

    }

    public static class MailMessage extends AbstractSendable {

        private final String message;

        public MailMessage(String from, String to, String message) {
            super(from, to);
            this.message = message;
        }

        public String getMessage() {
            return message;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;

            MailMessage that = (MailMessage) o;

            if (message != null ? !message.equals(that.message) : that.message != null) return false;

            return true;
        }

    }

    public static class MailPackage extends AbstractSendable {
        private final Package content;

        public MailPackage(String from, String to, Package content) {
            super(from, to);
            this.content = content;
        }

        public Package getContent() {
            return content;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;

            MailPackage that = (MailPackage) o;

            if (!content.equals(that.content)) return false;

            return true;
        }

    }

    public static class Package {
        private final String content;
        private final int price;

        public Package(String content, int price) {
            this.content = content;
            this.price = price;
        }

        public String getContent() {
            return content;
        }

        public int getPrice() {
            return price;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Package aPackage = (Package) o;

            if (price != aPackage.price) return false;
            if (!content.equals(aPackage.content)) return false;

            return true;
        }
    }

    public static class RealMailService implements MailService {
        @Override
        public Sendable processMail(Sendable mail) {
            return mail;
        }
    }

    /////////////////////////////////////////////////////////////////////////////////////////

    public static class UntrustworthyMailWorker implements MailService {
        private final MailService[] mailServices;
        private final RealMailService realMailService = new RealMailService();

        public UntrustworthyMailWorker(MailService[] mailServices) {
            this.mailServices = mailServices;
        }

        public MailService getRealMailService() {
            return this.realMailService;
        }

        @Override
        public Sendable processMail(Sendable mail) {
            for (MailService mailService : mailServices) {
                mail = mailService.processMail(mail);
            }
            return realMailService.processMail(mail);
        }
    }

    public static class Spy implements MailService {
        private final Logger logger;

        public Spy(Logger logger) {
            this.logger = logger;
        }

        @Override
        public Sendable processMail(Sendable mail) {
            if (mail instanceof MailMessage) {
                String to = mail.getTo();
                String from = mail.getFrom();
                String message = ((MailMessage) mail).getMessage();
                if (to.equals(AUSTIN_POWERS) || from.equals(AUSTIN_POWERS)) {
                    logger.log(Level.WARNING, String.format("Detected target mail correspondence: from %s to %s \"%s\"", from, to, message));
                } else {
                    logger.log(Level.INFO, String.format("Usual correspondence: from %s to %s", from, to));
                }
            }
            return mail;
        }
    }

    public static class Thief implements MailService {
        private final int minCost;
        private int stolenValue;

        public Thief(int minCost) {
            this.minCost = minCost;
            this.stolenValue = 0;
        }

        public int getStolenValue() {
            return stolenValue;
        }

        @Override
        public Sendable processMail(Sendable mail) {
            if (mail instanceof MailPackage mailPackage) {
                int price = mailPackage.getContent().getPrice();
                if (price >= minCost) {
                    stolenValue += price;
                    return new MailPackage(mailPackage.from, mailPackage.to, new Package(String.format("stones instead of %s", mailPackage.getContent().getContent()), 0));
                }
            }
            return mail;
        }
    }

    public static class Inspector implements MailService {

        @Override
        public Sendable processMail(Sendable mail) {
            if (mail instanceof MailPackage) {
                if (((MailPackage) mail).getContent().getContent().contains(WEAPONS) || ((MailPackage) mail).getContent().getContent().contains(BANNED_SUBSTANCE)) {
                    throw new IllegalPackageException();
                }
                if (((MailPackage) mail).getContent().getContent().contains("stones")) {
                    throw new StolenPackageException();
                }
            }
            return mail;
        }
    }

    public static class IllegalPackageException extends RuntimeException {

    }

    public static class StolenPackageException extends RuntimeException {

    }
}
