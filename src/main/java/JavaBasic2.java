public class JavaBasic2 {

    public static void main(String[] args) {

        /*int a = 5;
        int b = 6;
        int c;

        if (a == b) {
            c = a + b;
            System.out.println(c);
        } else {
            c = a - b;
            System.out.println(c);
        }*/

        int a = 2;
        int b = 3;
        int c;

        if (a == b) {
            c = a + b;
        } else {
            c = a - b;
        }

        System.out.println(c);

        c = a == b ? a + b : a - b;
        System.out.println(c);


        String x = "samochod";

        switch (x) {
            case "samochod":
                System.out.println("samochod");
                break;
            case "samochód":
                System.out.println("samochód");
                break;
            case "auto":
                System.out.println("auto");
                break;
            default:
                System.out.println("default");
        }

        String X = "samochod";

        switch(X) {
            case "samochód":
                System.out.println("samochód =" + ("samochód" == X));
                break;
            case "samochod":
                System.out.println("samochod =" + ("samochod" == X));
                break;
            case "auto":
                System.out.println("auto =" + ("samochód" == X));
                break;
            default:
                System.out.println("Wartość sprawdzana: " + X);
                break;
        }

        switch (x) {
            case "samochod":
                System.out.printf("%s = samochod%n", x);
                break;
            case "samochód":
                System.out.printf("%s = samochód%n", x);
                break;
            case "auto":
                System.out.printf("%s = auto%n", x);
                break;
            default:
                throw new IllegalStateException(
                        String.format("%s != samochod, samochód, auto%n", x));


    }
        String k = "samochod";
        switch (k)
        {
            case "samochod":
            {
                System.out.println(k + " jest równy samochod" );
                break;
            }
            case "samochód":
            {
                System.out.println("k jest równy samochód" );
                break;
            }

            case "auto":
            {
                System.out.println("k jest równy auto" );
                break;
            }

            default:
            {
                System.out.println("k nie jest równy samochód, samochod, auto" );
                break;
            }
        }
        int liczbs = 5;
        final int liczbs1 = 15;
        final int liczbs2 = 25;
        final int liczbs3 = 35;

        switch (liczbs)
        {
            case liczbs1:
            {
                System.out.println("liczbs jest rówana: " + liczbs1 );
                break;
            }
            case liczbs2:
            {
                System.out.println("liczbs jest rówana: " +  liczbs2 );
                break;
            }

            case liczbs3:
            {
                System.out.println("liczbs jest rówana: " + liczbs3);
                break;
            }

            default:
            {
                System.out.println("liczbs nie jest rówana: " + liczbs1 + ", " + liczbs2 + ", " +liczbs3 );
                break;
            }
        }

    }}