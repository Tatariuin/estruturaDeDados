package lista2recursividade;
import java.util.*;
public class Lista2Recursividade {
public static void main(String[] args) {
Scanner ler = new Scanner(System.in);

    int[] vet = {1,2,3,0,4,5,0,6,7,0};
    System.out.println(Arrays.toString(q10CompactaVetor(vet)));
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
    static boolean q1isPalindromo(String p,int cont){
        if(p.charAt(cont) != p.charAt(p.length() - 1 - cont)){
            return false;
        }
        if(cont == p.length()/2 -1){
            return true;
        }
        return q1isPalindromo(p, cont+1);
    }
    static int q2quantElementosPares(int[]v,int posicao,int pares){
        if(posicao == v.length){
            return pares;
        }
        if(v[posicao]%2 == 0){
        pares++;   
        }
        return q2quantElementosPares(v, posicao+1, pares);
}
    static int q2MaiorValor(int[]v,int maior,int posicao){
        if(posicao == v.length){
            return v[maior];
        }
        if(v[maior] < v[posicao]){
            maior = posicao;
        }
        return q2MaiorValor(v, maior, posicao+1);
    }
    static int q2QuantNumerosIguais(int[]v1,int[]v2){
        int totalIguais = 0;
        
        for(int i = 0;i < v1.length;i++){
            for(int c = 0;c < v2.length;c++){
                if(v1[i] == v2[c]){
                    totalIguais++;
                    break;
                }
            }
            
        }
        return totalIguais;
    }
    static int q3quantValorEntre(int[] v,int max,int min){
        int q = 0;
        
        for(int i = 0;i < v.length;i++){
            if(v[i] < max && v[i] > min){
                q++;
            }
        }
        return q;
    }
    static int[] q3valoresEntre(int[] v,int max,int min){
        int[] array = new int[q3quantValorEntre(v, max, min)];
        int c = 0;
        if(q3quantValorEntre(v, max, min) == 0){
        throw new UnsupportedOperationException("Valor minimo ou maximo invalido");
    }
        for(int i = 0;i < v.length;i++){
            if(v[i] < max && v[i] > min){
                array[c] = v[i];
                c++;
            }
        }
        return array;
    }
    static int q4MaiorNota(int[][] m){
        int n = 0,index = 0;
        for(int i = 0;i < m.length;i++){
            if(m[i][3] > n){
                n = m[i][3];
                index = i;
            }
        }
        return index;
    }
    static double q4MediaDaTurma(int[][]m){
        
        double media = 0;
        for(int i = 0;i < m.length;i++){
           media += m[i][3];
        }
        return media/m.length;
    }
    static void q4(){
        Scanner ler = new Scanner(System.in);
        int[][] notas = new int[5][4];
    
    for(int i = 0;i < notas.length;i++){
        for(int c = 1;c < notas[0].length;c++){
            notas[i][0] = i;
            if(c == 1){
                System.out.println("Informe a média das provas do "+(i+1)+"° aluno");
                notas[i][c] = ler.nextInt();
            }
            else if(c == 2){
                System.out.println("Informe a média dos trabalhos do "+(i+1)+"° aluno");
                notas[i][c] = ler.nextInt();
            }
            else{
                notas[i][c] = notas[i][1]+notas[i][2]; 
            }
        }
        
    }
    
    imprimeMatriz(notas);
    System.out.println("Matricula do aluno com maior nota: "+q4MaiorNota(notas));
    System.out.println("Média aritmetica da turma: "+q4MediaDaTurma(notas));
    }
    
    static void q5(){
        int[][] m = {{5,-8,10},{1,2,15},{25,10,7}};

    int[] v = new int[m[0].length];
    
    for(int c = 0;c < m[0].length;c++){
        for(int i = 0;i < m.length;i++){
            v[c] += m[i][c];
        }
    }
    System.out.println(Arrays.toString(v));
    }
    static double[] q6CalcuaNota(char[][] respostas,char[] gabarito){
        double[] pontuacao = new double[respostas.length];

    for(int i = 0;i < respostas.length;i++){
        for(int c = 0;c < respostas[0].length;c++){
          if(respostas[i][c] == gabarito[c]){
              pontuacao[i] += 1;
          }
        }
        pontuacao[i] = pontuacao[i]*100/respostas[0].length;
    }
    return pontuacao;
    }
    static void q6(){
        char[] gabarito = {'a','c','d','a','b','b','d','d','a','a'};
    char[][] respostas = {
    {'a','c','d','a','b','b','d','d','a','a'},
    {'a','b','a','a','b','a','c','c','a','b'},
    {'d','c','d','a','b','c','d','a','a','c'},
    {'a','d','c','c','d','b','b','d','c','d'},
    {'b','a','b','d','b','c','a','b','d','c'}
};
    double[] r  = q6CalcuaNota(respostas, gabarito);
    for(int i = 0;i<respostas.length;i++){
        System.out.println("O "+(i+1)+"° aluno acertou "+r[i]+"% da prova");
    }
    }
    
    static int q7FatorialDuplo(int f){
        
        if(f == 1){
            return 1;
        }
        if(f%2 != 0){
            return f*q7FatorialDuplo(f-1);
        }
        return q7FatorialDuplo(f-1);
    }
    
    static int q8SuperFatorial(int f,int fIndex){
        if(fIndex == 2){
            return 2;
        }
        if(f == 1){
            
            return f*q8SuperFatorial(f = fIndex - 1, fIndex-1);
        }
        return f*q8SuperFatorial(f-1, fIndex);
    }
    
    static int q9ContaCaracter(String s, char c,int i){
       
        if(i == s.length()){
            return 0;
        }
        if(Character.toLowerCase(s.charAt(i)) == Character.toLowerCase(c)){
           
            return 1+q9ContaCaracter(s, c, i+1);
        }
        return 0+q9ContaCaracter(s, c, i+1);
        
    }
    static int[] q10CompactaVetor(int[]v){
        int aux = 0;
        for(int i = 0;i < v.length;i++){
            for(int c = i+1;c < v.length;c++){
                if(v[c] == 0){
                    aux = v[i];
                    v[i] = v[c];
                    v[c] = aux;
                    break;
                }
            }
        }
        return v;
    }
}
