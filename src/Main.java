public class Main {
    static int a=0;
    static float[] умножение_векторов(float[] m, float[] n){
        float[] res = new float[n.length];
        res[0]=m[2]*n[1]-m[1]*n[2];
        res[1]=m[0]*n[2]-m[2]*n[0];
        res[2]=m[1]*n[0]-m[0]*n[1];
        return res;
    }
    static float[] норма(float[] m){
        float[] res = new float[m.length];
        res[0]=m[0]/Math.abs(m[0]*m[0]+m[1]*m[1]+m[2]*m[2]);
        res[1]=m[1]/Math.abs(m[0]*m[0]+m[1]*m[1]+m[2]*m[2]);
        res[2]=m[2]/Math.abs(m[0]*m[0]+m[1]*m[1]+m[2]*m[2]);
        return res;
    }

static int[][] сложение(int[][] m, int[][] n){
    int[][] res = new int[m.length][m[0].length];
    if(m.length==n.length&m[0].length==n[0].length) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++) {
                res[i][j] = m[i][j] + n[i][j];
            }
        }
        return res;
    }else{
        System.out.println("Разные размеры");
        a=1;
        return res;
    }
}
    static int[][] умножение(int[][] m, int[][] n){
    int a=0;
        int[][] res = new int[m.length][n[0].length];
        if(m[0].length==n.length){
            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m[0].length; j++) {
                    a=0;
                    for(int r=0; r<m[0].length; r++){
                        a+=(m[i][r]*n[r][j]);
                    }
                    res[i][j]=a;
                }
            }
            return res;
        }else{
            System.out.println("Разные размеры");
            a=1;
            return res;
        }
    }

    static int[][] умножение_на_скаляр(int[][] m, int n){
        int[][] res = new int[m.length][m[0].length];
            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m[0].length; j++) {
                    res[i][j] = m[i][j] * n;
                }
            }
            return res;
        }
public static void main(String[] args) {
    int[][] m={{1,2},{1,2}};
    int[][] n={{2,1},{2,1}};
    float[] v={1,2,4};
    float[] b={1,0,0};
    System.out.println("норма v=");
    for(int i=0; i< норма(v).length; i++){
        System.out.print(норма(v)[i]);
        System.out.println(" ");
    }
    System.out.println("норма b=");
    for(int i=0; i< норма(b).length; i++){
        System.out.print(норма(b)[i]);
        System.out.println(" ");
    }
    System.out.println(" ");
    System.out.println("произведение векторов v и b=");
    for(int i=0; i< умножение_векторов(v,b).length; i++){
        System.out .print(умножение_векторов(v,b)[i]);
        System.out.println(" ");
    }
    System.out.println(" ");
    int k=7;
    сложение(m,n);
    if(a==0) {
        System.out.println("m+n=");
        for (int i = 0; i < сложение(m, n).length; i++) {
            for (int j = 0; j < сложение(m, n)[0].length; j++) {
                System.out.print(сложение(m, n)[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }else{}
    if(m[0].length==n.length){
        System.out.println("m*n=");
        for(int i=0; i<умножение(m,n).length; i++){
            for(int j=0; j<умножение(m,n)[0].length; j++){
                System.out.print(умножение(m,n)[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }else{}
    System.out.println("m*"+k);
    for(int i=0; i<умножение_на_скаляр(m,k).length; i++){
        for(int j=0; j<умножение_на_скаляр(m,k)[0].length; j++){
            System.out.print(умножение_на_скаляр(m,k)[i][j]);
            System.out.print(" ");
        }
        System.out.println(" ");
    }
}
}