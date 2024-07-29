package com.srijan.rest.webservices.restful_web_services;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RestfulWebServicesApplicationTests {

	@Test
	void contextLoads() {
		//
		//
		// code to find the row in matrix whixh has max ones in it 
		public int countOnes(int[][] arr){
			// initialisation
			int m = arr.length;
			int n = arr[0].length;
			int maxOnes = 0;
			int maxOnesRow = -1;

			// logic 

			for(int i=0;i<m;i++){
				int countOne = 0;
				for(int j=0;j<n;j++){
					if(arr[i][j]==1)
						countOne++;
				}

				if( countOne>maxOnes){
					maxOnes = countOne;
					maxOnesRow = i;
				}
			}

			// return 
			return maxOnesRow;
		}
	}

}
