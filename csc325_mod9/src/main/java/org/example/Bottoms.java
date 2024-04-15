package org.example;


public interface Bottoms {
    String getInfo();

    class CasualBottom implements Bottoms {
        // Methods for info on bottoms
        // info about cas bottoms
        public String getInfo() {
            return "Casual Pants";
        }
    }
    class PartyBottom implements Bottoms {

        // info about party bottoms
        public String getInfo() {
            return "Party Bottoms";
        }
    }
    class ProBottom implements Bottoms {

        // info about pro bottoms
        public String getInfo() {
            return "Professional Bottoms";
        }
    }
}
