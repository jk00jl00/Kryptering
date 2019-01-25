/**
 * Created by isjo16 on 2019-01-25.
 */
public class Bitcoord {
    short coord;

    public Bitcoord(){
        coord = (short)0b0;
    }

    public Bitcoord(short h, short l){
        coord = (short)0b0;
        setHigh(h);
        setLow(l);
    }

    public void setHigh(short i){
        short a = clamp(i);
        a  = (short)(a<<8);
        coord = (short)(coord&0b11111111);
        coord = (short)(coord|a);
    }
    public void setLow(short i){
        short a = clamp(i);
        coord = (short)(coord& 0b1111111100000000);
        coord = (short)(coord|a);
    }
    public int getHigh(){
        return (coord&65535)>>8;
    }

    public int getLow(){
        int i = coord& 0b11111111;
        return  i;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("(High: ").append(this.getHigh()).append(", Low: ").append(this.getLow()).append(")");
        return sb.toString();
    }

    static short clamp(short val){
        return (val < 0) ? 0 : (val < 200) ? val : 199;
    }

    public static void main(String[] args) {
        Bitcoord b = new Bitcoord((short)15, (short)55);
        System.out.println(b.toString());
        b.setHigh((short) 123);
        System.out.println(b.toString());
        b.setHigh((short) 290);
        System.out.println(b.toString());
        b.setHigh((short) -30);

        b.setLow((short) 123);
        System.out.println(b.toString());
        b.setLow((short) 290);
        System.out.println(b.toString());
        b.setLow((short) -30);
        System.out.println(b.toString());

    }
}
