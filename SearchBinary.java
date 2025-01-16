import java.util.Scanner;
class SearchBinary
{
	public static void main(String args[]){

		int []data = new int[10];

		data[0] = 2;
		data[1] = 9;
		data[2] = 3;
		data[3] = 4;
		data[4] = 7;
		data[5] = 6;
		data[6] = 5;
		data[7] = 1;
		data[8] = 8;
		data[9] = 10;

		for(int i = 0; i<data.length ; i++){
			int temp = i;
			for(int j = i + 1; j<data.length ; j++){

				if(data[j]<data[temp]){
				 temp = j;
				}
			}
			int swap = data[i];
			data[i] = data[temp];
			data[temp] = swap;
		}

		for(int i = 0; i<data.length ; i++){

			System.out.println(data[i]);
		}

	}
}