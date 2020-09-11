public class House {
    int a;
    int b=3;
    int c;
    static class builder {
        private int a=0;
        private int b=0;
        private int c=0;

        public builder a(int x) {
            a = x;
            return this;
        }

        public builder b(int y) {
            b = y;
            return this;
        }

        public builder c(int z) {
            c = z;
            return this;
        }

        public House build(){
            House h=new House();
            h.a=a;
            h.b=b;
            h.c=c;
            return h;
        }
    }
    public static builder tobuild(){
        return new builder();
    }

    @Override
    public String toString() {
        return "House{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
class main{
    public static void main(String[] args) {
           House h= House.tobuild().b(2).c(3).build();
           System.out.println(h);

    }
}
