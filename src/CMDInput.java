/**
 * Created by isjo16 on 2019-01-11.
 */
public class CMDInput {
    public static void main(String[] args) {
        switch(args.length){
            case 0:
                System.out.println("Programmet vet inte vad det ska göra! Avbryter...");
                break;
            case 1:
                System.out.println("Så du säger " + args[0]);
                break;
            case 2:
                int one = 0;
                int two = 0;

                try {
                    one = Integer.parseInt(args[0]);
                    two = Integer.parseInt(args[1]);
                } catch (NumberFormatException e) {
                    System.out.println("Det där var inte siffor.");
                    return;
                }
                int out = one + two;
                System.out.println(out);
                break;
            case 3:
                for(int i = 2; i >= 0; i--){
                    System.out.println(args[i]);
                }
                break;
            case 4:
                System.out.println("Jag orkar inte, jag stänger ner");
                break;
        }
    }
}
