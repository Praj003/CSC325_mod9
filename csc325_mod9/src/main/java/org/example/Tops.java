package org.example;

public interface Tops {
// gets info of shoes
    String  getInfo();

    class CasualTop implements Tops{

        // info for cas tops
        public String getInfo() {
            return "Casual Top";
        }
    }

    class PartyTop implements Tops{

        // info for party tops
        public String getInfo() {
            return "Party Tops";
        }
    }

    class ProTops implements Tops{

        // info for pro tops
        public String getInfo() {
            return "Professional Tops";
        }
    }
}

