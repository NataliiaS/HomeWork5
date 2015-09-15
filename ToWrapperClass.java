package sourseit.HomeWork.Sydorenko.HomeWork5;

public class ToWrapperClass
{
    public static Integer[] toInteger(int[] iar) {

        Integer[] newArrayI = new Integer[iar.length];
        for (int i = 0; i < iar.length; i++) {
            newArrayI[i] = Integer.valueOf(iar[i]);
        }
        return newArrayI;
    }
    public static Long[] toLong (long [] lar) {

        Long[] newArrayL = new Long[lar.length];
        for (int i = 0; i < lar.length; i++) {
            newArrayL[i] = Long.valueOf(lar[i]);
        }
        return newArrayL;
    }
    public static Boolean[] toBoolean(boolean[] bar) {

        Boolean[] newArrayB = new Boolean[bar.length];
        for (int i = 0; i < bar.length; i++) {
            newArrayB[i] = Boolean.valueOf(bar[i]);
        }
        return newArrayB;
    }
    public static Double[] toDouble(double[] dar) {

        Double[] newArrayB = new Double[dar.length];
        for (int i = 0; i < dar.length; i++) {
            newArrayB[i] = Double.valueOf(dar[i]);
        }
        return newArrayB;
    }
}
