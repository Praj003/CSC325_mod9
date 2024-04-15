package org.example;

public class bMain {
    public static void main(String[] args) {

        // creates builds for the 3 types of garments
        Garment casualBuilder = new Garment.CasualGarment();
        Garment partyBuilder = new Garment.PartyGarment();
        Garment proBuilder = new Garment.ProGarment();

        // prints casual garments
        Tops casualTop = casualBuilder.newTop();
        Bottoms casualBottom = casualBuilder.newBottom();
        Shoes casualShoes = casualBuilder.newShoes();
        System.out.println("Casual Build:\n" + casualTop.getInfo() +
                "\n" + casualBottom.getInfo()+ "\n" +casualShoes.getInfo()+ "\n");

        // prints party garments
        Tops partyTop = partyBuilder.newTop();
        Bottoms partyBottom = partyBuilder.newBottom();
        Shoes partyShoes = partyBuilder.newShoes();
        System.out.println("Party Build:\n" + partyTop.getInfo() +
                "\n" + partyBottom.getInfo()+ "\n" +partyShoes.getInfo() + "\n");

        // prints pro garments
        Tops proTop = proBuilder.newTop();
        Bottoms proBottom = proBuilder.newBottom();
        Shoes proShoes = proBuilder.newShoes();
        System.out.println("Professional Build:\n" + proTop.getInfo() +
                "\n" + proBottom.getInfo()+ "\n" +proShoes.getInfo());
    }
}


