package org.DenWorker.Java_Core._2_OOP._2_3_Packages;

public class Task_2_3_11 {
    public static void main(String[] args) {
        System.out.println("gg");
    }

    public class Human {
        private final String secret; //секретики
        private final String news; //новости
        private final String experience; //опыт
        private final String gossip; //сплетни

        public Human(String secret, String news, String experience, String gossip) {
            this.secret = secret;
            this.news = news;
            this.experience = experience;
            this.gossip = gossip;
        }

        private String getSecret() {
            return secret;
        }

        public String getNews() {
            return news;
        }

        protected String getExperience() {
            return experience;
        }

        String getGossip() {
            return gossip;
        }
    }

}
