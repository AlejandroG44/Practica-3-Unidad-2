package practica3;

public class practica3 {

    public long combinaDigitos(long n, long m){
        long combinado=0;
        long x=1;
        while(n>0 && m>0){
            combinado=combinado+(((n%10*10)+(m%10))*x);
            x=x*100;
            n=n/10;
            m=m/10;
            if(m==0)
                combinado = combinado + n * x;
            if(n==0)
                combinado = combinado + m * x;
        }
        return combinado;
    }

    public String noVocales(String cadena){
        String nueva="";
        cadena=cadena.toLowerCase();
        for(int i=0; i<cadena.length(); i++)
            switch (cadena.charAt(i)){
                case'a':
                case'e':
                case'i':
                case'o':
                case'u': nueva+="";
                break;
                default: nueva+=cadena.charAt(i);
                break;
            }
        return nueva;
    }


    public  int sumatoria(int [] n){
        int suma=0;

        for(int i=0; i<n.length; i++){
            suma+=n[i];
        }
        return suma;
    }

    public int [] mutiplos(int [] a, int n){
        int [] mult=new int[a.length];
        int c=0;
        for (int i=0; i< a.length; i++){
            if(a[i]%n==0) {
                mult[c] = a[i];
                c++;
            }
        }
        return mult;
    }



    public static void main(String [] args){

        practica3 p=new practica3();
        int [] a={1,3,5};
        int [] b={2,4,6};
        int [] n={6,4,7,3};

        System.out.println(p.combinaDigitos(2, 3));
        System.out.println(p.noVocales("hola mundo"));
        System.out.println(p.sumatoria(n));
        System.out.println(p.mutiplos(n,2));


    }

    static void Juntar(int[] x, int[] y, int z[]) {

		System.arraycopy(x, 0, z, 0, x.length);
		System.arraycopy(y, 0, z, x.length, y.length);
		
		for(int i=0;i<z.length;i++) {
			System.out.println(z[i]);
		}
	}

	public static void Retornar(int x) {

		long a = 0;

		
			if (x % 10 == 3)
				a = x / 10;
			else if (x % 10 == 5)
				a = x / 10;
			else if (x % 10 == 7)
				a = x / 10;
		
			
		System.out.print(a);
		
		
	}


}
