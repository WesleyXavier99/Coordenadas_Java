package pacoteprova2;

import java.util.Scanner;

public class ArcoFlecha {

	public static void main(String[] args) {
		/*O comit� ol�mpico est� testando uma nova forma de pontuar as competi��es de arco e flecha, 
		baseada em penalidades. O atleta vai atirar N flechas no alvo, em sequ�ncia. A penalidade da 
		K-�sima flecha atirada � computada imediatamente ap�s ela atingir o alvo, antes do pr�ximo lan�amento, 
		e � igual ao n�mero de flechas que est�o no alvo naquele momento cuja dist�ncia ao centro do alvo � menor 
		ou igual � dist�ncia da K-�sima flecha ao centro, excluindo a pr�pria K-�sima flecha. Quer dizer, a penalidade 
		� o n�mero das K-1 flechas lan�adas antes da K-�sima flecha que est�o mais pr�ximas ou � mesma dist�ncia do centro 
		do alvo, comparadas com a K-�sima flecha. A penalidade total � a soma das penalidades das N flechas. Ganha o atleta 
		que tiver a menor penalidade total ao final. Veja que a penalidade total pode ser zero, se o atleta for bom o bastante 
		para acertar numa sequ�ncia estritamente decrescente de dist�ncias ao centro do alvo.
	
	
		Neste problema, o centro do alvo est� na origem (0,0). Dada a sequ�ncia de coordenadas dos pontos em que as sucessivas 
		flechas atingiram o alvo, seu programa deve computar a penalidade total final do atleta.*/
		
		//Declara��o de v�riaveis
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
			
			//verificando penaliza��es
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
			
			//exibindo total de penaliza��es
			System.out.println(penalidades);
			
		
	}
	
}
