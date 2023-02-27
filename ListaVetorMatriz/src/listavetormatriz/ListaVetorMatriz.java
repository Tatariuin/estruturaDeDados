package listavetormatriz;
import java.util.*;
public class ListaVetorMatriz {
public static void main(String[] args) {
Scanner ler = new Scanner(System.in);

}
static void imprimeMatriz(int[][]m){
    for(int i = 0;i < m.length;i++){
        for(int c = 0;c < m[0].length;c++){
            if(c == m[0].length - 1){
                System.out.print("|"+m[i][c]+"|\n");
            }
            else{
                System.out.print("|"+m[i][c]+"|");
            }
        }
    }
}
static boolean elementoJaExistente(int elemento,int[] vetor){
        for(int i: vetor){
            if(elemento == i){
                return true;
            }
        }
        return false;
    }

    static void q1(){
        int c = 0,k = 0,par = 0,impar = 0;
    int[]v = {1,2,3,4,5,6,7,8,9,10};
    int[]v1 = new int[10];
    int[]v2 = new int[10];
    
    for(int i:v){
        if(i%2 == 0){
            v2[c] = i;
            c++;
            par++;
        }
        else{
            v1[k] = i;
            k++;
            impar++;
        }
    }
    for(int i = 0;i < impar;i++){
        System.out.println("v1: "+v1[i]);
    }
    System.out.println("--------------------");
    for(int i = 0;i < par;i++){
        System.out.println("v2: "+v2[i]);
    }
    }
    
    static void q2(){
        Scanner ler = new Scanner(System.in);

        double[] vet = new double[5];
    
    for(int i = 0;i < vet.length;i++){
        System.out.println("Informe o "+(i+1)+"° elemento do array");
        vet[i] = ler.nextDouble();
    }
    System.out.println("Informe a opção desejada\n0 - Finalizar o script\n1 - Ver o array na ordem direta\n2 - ver o vetor na ordem inversa");
    int x = ler.nextInt();
    
    switch(x){
        case 0:
            break;
        case 1:
            for(double i: vet){
                System.out.println(i);
            }
            break;
        case 2:
            for(int i = vet.length-1; i >= 0 ;i--){
                System.out.println(vet[i]);
            }
            break;
        default:
            System.out.println("Opção invalida");
            
    }
    }
    
    static void q3(){
        int [] vet = {1,2,3,4,4,6,3,1,2,10};
    String resultado = "";
    
    for(int i = 0;i < vet.length;i++){
        for(int c = i+1;c < vet.length;c++){
            if(vet[i] == vet[c]){
                resultado += "Elementos repetidos:\n"+vet[i]+"\n";
                break;
            }
        }
    }
    
    if(resultado == ""){
        System.out.println("Não há elementos repetidos no array");
    }
    else{
        System.out.println(resultado);
    }
    }
    static int[] q4Soma(int[]y,int[]x){
         int[] soma = new int[5];
        for(int i = 0; i < x.length;i++){
        soma[i] = x[i]+y[i];
        
        
    }
        return soma;
    }
    static int[] q4Multiplicacao(int[]y,int[]x){
        int[] mult = new int[5];
        for(int i = 0; i < x.length;i++){
        mult[i] = x[i]*y[i];
    }
        return mult;
    }
    static int[] q4Diferença(int[]y,int[]x){
        int[] diff = new int[5];
        int k = 0;
    for(int i: x){
        if(!elementoJaExistente(i, y)){
            diff[k] = i;
            k++;
        }
    }
    return diff;
    }
    
    static int[] q4Interseção(int[]y,int[]x){
        int[] inter = new int[5];
        int k = 0;
        for(int i: x){
        if(elementoJaExistente(i, y)){
            inter[k] = i;
            k++;
        }
        }
        return inter;
        }
    
    static int[] q4Uniao(int[]y,int[]x){
        int[] uni = new int[x.length+y.length];
        for(int i = 0; i < x.length;i++){
       uni[i] = x[i];
   }

   int k = x.length;
   
   for(int i:y){
       if(!elementoJaExistente(i, uni)){
           uni[k] = i;
           k++;
       }
   }
    
    return uni;
    }
        
    static void q4(){
    int[]x = {1,2,3,4,5};
    int[] y = {6,7,8,9,10};

    //Soma e multiplicação
        System.out.println(Arrays.toString(q4Soma(y, x)));
        System.out.println(Arrays.toString(q4Multiplicacao(y, x)));
        
        
        
    //------------------------
    
    //Diferença
    System.out.println(Arrays.toString(q4Diferença(y, x)));
    //------------------------
    
    //Interseção
    System.out.println(Arrays.toString(q4Interseção(y, x)));
    
    //-------------------------
   //União
   System.out.println(Arrays.toString(q4Uniao(y, x)));
    
    }
    
    static void q5(){
        Scanner ler = new Scanner(System.in);
        int[] vet = new int[10];
        int n = 0,i = 0;
        do{
    System.out.println("Informe o "+i+"° elemento no array ");
    n = ler.nextInt();
   
    if(!elementoJaExistente(n, vet)){
        vet[i-1] = n;
        i++;
    }
}while(elementoJaExistente(n, vet));
    }
    static void q6(){
        q6ObjetoAluno[] sala = new q6ObjetoAluno[10];
    int maisAlto = 0,maisBaixo = 0;
    for(int i = 0; i < sala.length;i++){
       Scanner ler = new Scanner(System.in);
        System.out.println("Informe o nome e altura do "+(i+1)+"º aluno");
        sala[i] = new q6ObjetoAluno(ler.nextLine(),ler.nextDouble());
        
        if(sala[maisAlto].getAltura() < sala[i].getAltura()){
            maisAlto = i;
        }
        if(sala[maisBaixo].getAltura() > sala[i].getAltura()){
            maisBaixo = i;
        }
    }
    System.out.println("Aluno mais Alto: "+sala[maisAlto]+"\nAluno mais baixo: "+sala[maisBaixo]);
    }
    static void  q7(){
        Scanner ler = new Scanner(System.in);
    System.out.println("Informe o tamanho  do primeiro vetor");
    int[] x = new int[ler.nextInt()];
    System.out.println("Informe o tamanho  do segundo vetor");
    int[] y = new int[ler.nextInt()];
    
    for(int i = 0; i <x.length;i++){
        System.out.println("Insira os elementos do primeiro vetor");
        x[i] = ler.nextInt();
    }
    for(int i = 0; i <y.length;i++){
        System.out.println("Insira os elementos do segundo vetor");
        y[i] = ler.nextInt();
    }
    
    System.out.println("União dos dois vetores: "+Arrays.toString(q4Uniao(y, x)));
    }
    static void q8(){
         int[] x = {1,2,3,4,5,6,7,8,9,10},y = {11,12,13,14,15,16,17,18,19,20},z = new int[(x.length+y.length)];
    int xI = 0,yI = 0;
    for(int i = 0;i < z.length;i++){
        if(i%2 != 0){
            z[i] = x[xI];
            xI++;
        }
        else{
            z[i] = y[yI];
            yI++;
        }
    }
    System.out.println(Arrays.toString(z));
    }
    
    static void q9(){
        Clientes[] c = new Clientes[3];
    
    for(int i = 0;i < c.length;i++){
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe o nome e a quantidade de dvd's locados pelo cliente");
        c[i] = new Clientes(ler.nextLine(),ler.nextInt());
    }
    for(Clientes c1:c){
        System.out.println("Nome: "+c1.getNome()+",quantidade de alocações gratis: "+c1.quantidadeDeAlocacoesGratis());
    }
    }
    static void q11(){
        Scanner ler = new Scanner(System.in);
        int[][] mat = new int[4][4];
        int qntDeElementosMaiorQue10 = 0; 
        for(int i = 0; i < mat.length;i++){
            for(int c = 0; c < mat[0].length;c++){
                System.out.println("Informe o valor");
                mat[i][c] = ler.nextInt();
                if(mat[i][c] > 10){
                qntDeElementosMaiorQue10++;
                }
        }
        
    }
    System.out.println("A quantidade de elementos da matriz maior que 10 é: "+qntDeElementosMaiorQue10);
    }
    
    static String q12EcontraElementoNaMatriz(int[][]m,int elemento){
        
        for(int i = 0; i < m.length;i++){
            for(int c = 0; c < m[0].length;c++){
                if(m[i][c] == elemento){
                    return "["+i+"]["+c+"]";
                }
            }
        }
        return "Elemento não encontrado";
    }
    static void q12(){
        Scanner ler = new Scanner(System.in);
        int [][]mat = new int[5][5];
    
        for(int i = 0; i < mat.length;i++){
            for(int c = 0; c < mat[0].length;c++){
                System.out.println("Informe o valor");
                mat[i][c] = ler.nextInt();

        }
        
    }
    System.out.println("Informe o elemento que voçê deseja procurar na matriz");
    System.out.println(q12EcontraElementoNaMatriz(mat, ler.nextInt()));
    }
    static void q13(){
        Scanner ler = new Scanner(System.in);
        System.out.println("Informe a quantidade de linhas e colunas que a matriz deverá ter");
    int[][] mat = new int[ler.nextInt()][ler.nextInt()];
    
    
    
    for(int i = 0; i < mat.length;i++){
            for(int c = 0; c < mat[0].length;c++){
                System.out.println("Informe o valor");
                mat[i][c] = ler.nextInt();

        }
        
    }
    int query = 0;
    do{
        System.out.println("Informe o elemento que voçê deseja procurar na matriz");
        query = ler.nextInt();
        System.out.println(q12EcontraElementoNaMatriz(mat, query));
    }while(query > -1);
    }
    
    static void q14(){
        int[][] m = {{1,2,3,4,5,6},{1,2,3,4,5,6},{1,2,3,4,5,6}};
    int somaDeColunasPares = 0,modMatriz = 0;
    double mediaAritimetica = 0;
    for(int i = 0;i < m.length;i++){
        for(int c = 0;c < m[0].length;c++){
            if(c%2 != 0){
                somaDeColunasPares += m[i][c];
            }
            if(c == 1 || c == 3){
                mediaAritimetica += m[i][c];
            }
            if(c == 0){
                m[i][5] = m[i][0]+m[i][1];
            }
        }
    }
    for(int i = 0;i < m.length;i++){
        for(int c = 0;c < m[0].length;c++){
            if(c == m[0].length - 1){
                System.out.print("|"+m[i][c]+"|\n");
            }
            else{
                System.out.print("|"+m[i][c]+"|");
            }
        }
    }
    mediaAritimetica = mediaAritimetica/(m.length*2);
    System.out.println("Soma de colunas pares: "+somaDeColunasPares+"\nMédia aritmética: "+mediaAritimetica);
    }
    static void q15(){
        int[][] m = {{1,2,3,4,5,6},{1,2,3,4,5,6},{1,2,3,4,5,6}};
int[] vet = new int[m[0].length];
int soma = 0;

    for(int i = 0;i < m[0].length;i++){
        for(int c = 0;c < m.length;c++){
            soma += m[c][i];
        
        }
        
        vet[i] = soma;
        soma = 0;
        
       
}
 System.out.println(Arrays.toString(vet));
    }
    static void q16(){
        int[][]m = {
        {1,2,3,4},
        {1,2,3,4},
        {1,2,3,4},
        {1,2,3,4}
    };
    int soma = 0;
    for(int i = 0;i < m.length;i++){
        for(int c = 0;c < m[0].length;c++){
            if(i - c < 0){
                soma += m[i][c];
            }
        }
    }
    System.out.println(soma);
    }
    
    static void q17(){
         int[][]m = {
        {1,2,3,4},
        {1,2,3,4},
        {1,2,3,4},
        {1,2,3,4}
    };
    for(int i = 0; i < m.length;i++){
        m[i][i] = 1;
}
for(int i = 0;i < m.length;i++){
        for(int c = 0;c < m[0].length;c++){
            if(c == m[0].length - 1){
                System.out.print("|"+m[i][c]+"|\n");
            }
            else{
                System.out.print("|"+m[i][c]+"|");
            }
        }
    }
    }
    static void q18(){
        char[][] respostas = {
    {'a','c','d','a','b','b','d','d','a','a'},
    {'a','b','a','a','b','a','c','c','a','b'},
    {'d','c','d','a','b','c','d','a','a','c'},
    {'a','d','c','c','d','b','b','d','c','d'},
    {'b','a','b','d','b','c','a','b','d','c'}
};

char[] gabarito = {'a','c','d','a','b','b','d','d','a','a'};

double[] pontuacao = new double[respostas.length];

for(int i = 0;i < respostas.length;i++){
        for(int c = 0;c < respostas[0].length;c++){
          if(respostas[i][c] == gabarito[c]){
              pontuacao[i] += 1;
          }
        }
    }
    System.out.println(Arrays.toString(pontuacao));
    }
    static int[][] q19Soma(int[][] m1, int[][]m2){
        int[][] m3 = new int[m1.length][m1[0].length];
        
        for(int i = 0;i < m1.length;i++){
            for(int c = 0;c < m1.length;c++){
                m3[i][c] = m1[i][c] + m2[i][c];
            }
        }
        return m3;
        
    }
    static int[][] q19Subtracao(int[][] m1, int[][]m2){
        int[][] m3 = new int[m1.length][m1[0].length];
        
        for(int i = 0;i < m1.length;i++){
            for(int c = 0;c < m1.length;c++){
                m3[i][c] = m1[i][c] - m2[i][c];
            }
        }
        return m3;
        
    }
    static int[][] q19multiplicaoPorConstante(int[][]m1,int constante){
        for(int i = 0;i < m1.length;i++){
            for(int c = 0;c < m1.length;c++){
                m1[i][c] = m1[i][c] * constante;
            }
        }
        return m1;
    }
    
    static void q19(){
        Scanner ler = new Scanner(System.in);
  
int op = 0;
     int[][]m1 = {
        {1,2,3},
        {1,2,3},
        {1,2,3},
    };
     int[][]m2 = {
        {1,2,3},
        {1,2,3},
        {1,2,3},
    };
     System.out.println("Informe a opção desejada\n1 - Somar matrizes\n2 - Subtrair matrizes\n3 - Multiplicar a matriz por uma constante");
     op = ler.nextInt();
     
     if(op == 1){
         imprimeMatriz(q19Soma(m1, m2));
         
     }
     else if(op == 2){
         imprimeMatriz(q19Subtracao(m1, m2));
     
}
     else{
         System.out.println("Informe o valor da constante");
         m1 =  q19multiplicaoPorConstante(m1, ler.nextInt());
         
         imprimeMatriz(m1);
     }
    }
}
