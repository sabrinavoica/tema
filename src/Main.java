public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //operatorul ternar
         int numar = 86;
        if (numar < 0) {
            System.out.println("Numarul este mai mic decat 0.");

        }
        else {
            System.out.println("Am intrat pe ramura else.");
        }
        // conditie ? instructiunea_true : instuctiunea_false
        System.out.println(numar < 0 ? "instructiunea a fost tru" : "instructiunea a fost falsa");

        //system.out.prinntln("dupa insructiunea if");

        double nota = 9;
        //instructiunea IF-ELSE-if;
        String ziua = "duminica";
        if (nota == 10) {
            System.out.println("nota maxima 10");
        }
        else if (nota == 9) {
            System.out.println("nota 9");
        }
        else if (nota < 8 && nota > 7){
            System.out.println("nota intre 7 si 8 ");
        }
        else {
            System.out.println("am executat ramura else");
        }

        switch (ziua) {
            case "sambata": {
                System.out.println("ziua sambata switch");
                break;
            }
            case "duminuca": {
                System.out.println("ziua duminca");
                break;
            }
            case "luni" : {
                System.out.println("luni");
                break;
            }
            default: {
                System.out.println("nu este weekand - switch");
            }
        }

        //tip array



    }




}