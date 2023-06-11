public abstract class Main {
    public static void main(String[] args) {
        createObject("Iphone").print();
        createObject("Nokia").print();
        createObject("Samsung").print();




    }
    public static Phone createObject (String className){
        Printable printable=null;

        switch (className){

            case "Iphone":
                Iphone iphone = new Iphone();
                return iphone;
            case "Nokia":
                Nokia nokia = new Nokia();
                return nokia;
            case "Samsung":
                Samsung samsung = new Samsung();
                return samsung;
        }
        return (Phone) printable;
    }
}