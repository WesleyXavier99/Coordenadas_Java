package pacoteprova2;

import java.util.Scanner;

public class ArcoFlecha {

	public static void main(String[] args) {
		/*O comitê olímpico está testando uma nova forma de pontuar as competições de arco e flecha, 
		baseada em penalidades. O atleta vai atirar N flechas no alvo, em sequência. A penalidade da 
		K-ésima flecha atirada é computada imediatamente após ela atingir o alvo, antes do próximo lançamento, 
		e é igual ao número de flechas que estão no alvo naquele momento cuja distância ao centro do alvo é menor 
		ou igual à distância da K-ésima flecha ao centro, excluindo a própria K-ésima flecha. Quer dizer, a penalidade 
		é o número das K-1 flechas lançadas antes da K-ésima flecha que estão mais próximas ou à mesma distância do centro 
		do alvo, comparadas com a K-ésima flecha. A penalidade total é a soma das penalidades das N flechas. Ganha o atleta 
		que tiver a menor penalidade total ao final. Veja que a penalidade total pode ser zero, se o atleta for bom o bastante 
		para acertar numa sequência estritamente decrescente de distâncias ao centro do alvo.
	
	
		Neste problema, o centro do alvo está na origem (0,0). Dada a sequência de coordenadas dos pontos em que as sucessivas 
		flechas atingiram o alvo, seu programa deve computar a penalidade total final do atleta.*/
		
		//Declaração de váriaveis
		int n,x,y,i,penalidades=0;
		
			//Lendo o N(numero de flechadas)
			System.out.println("Digite o numero de flechadas:");
			Scanner in = new Scanner(System.in);
			n = in.nextInt();
			
			//Declarando o vetor que vai armazenar cada coordenada
			Cooordenadas[] flechadas = new Cooordenadas[n];
			
			//Lendo uma por uma, cada coordenada
			for(i=0;i<n;i++) {
				System.out.println("Digite a coordenada x da flechada"+(i+1)+"");
				x = in.nextInt();
				System.out.println("Digite a coordenada y da flechada"+(i+1)+"");
				y = in.nextInt();
				
				//salvando a coordenada lida
				flechadas[i] = new Cooordenadas(x,y);
			}
			
			
			//Variaveis marcadoras das coordenadas do vetor flechadas
			double anterior,atual;
			
			//verificando penalizações
			for(i=1;i<n;i++) {
				
				//Capturando a flechada atual e a anterior
				atual = flechadas[i].distancia(flechadas[i].x,flechadas[i].y); 
				anterior = flechadas[i-1].distancia(flechadas[i-1].x,flechadas[i-1].y);
				
				//Comparando a distancia da coordenada anteriormente digitada com a atual
				if(atual>=anterior){
					
					//incrementa penalidades
					penalidades+=i;
				}
			}
			
			//exibindo total de penalizações
			System.out.println(penalidades);
			
		
	}
	
}
