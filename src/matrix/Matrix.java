package matrix;

import java.util.Scanner;

public class Matrix {
    
	
	//Captura valores da primeira Matriz
	public void  matrix() 
	{
		System.out.println("Digite o valor de linhas da primeira Matriz: ");
		Scanner readfirstmatrix = new Scanner(System.in);
		int a = readfirstmatrix.nextInt();
		System.out.println("Digite o valor de colunas da primeira Matriz: ");
		Scanner readsecondmatrix = new Scanner(System.in);
		int b = readsecondmatrix.nextInt();
		System.out.println("Digite o valor de linhas da segunda Matriz: ");
		Scanner readthirdmatrix = new Scanner(System.in);
		int c = readthirdmatrix.nextInt();
		System.out.println("Digite o valor de colunas da segunda Matriz: ");
		Scanner readforthmatrix = new Scanner(System.in);
		int d = readforthmatrix.nextInt();
		
		int [][]matrix = new int[a][b];
		int [][]matrixone = new int[c][d];
		
		Scanner readpositionsmatrix = new Scanner(System.in);
		
		
	    for(int i=0; i<a; i++) //Percorrendo as linhas
	    {
	    	for(int j=0; j<b; j++) //Percorrendo as colunas
	    	{
	    		System.out.println("Digite o valor na posição: ["+ i +"]" + "["+ j +"]:");	
	    		matrix[i][j] = readpositionsmatrix.nextInt();
	    		
	    	}
	   }
	
		
		Scanner readpositionsmatrix2 = new Scanner(System.in);
		
		
	    for(int i=0; i<c; i++) //Percorrendo as linhas da segunda matrix
	    {
	    	for(int j=0; j<d; j++) //Percorrendo as colunas da segunda matrix
	    	{
	    		System.out.println("Digite o valor na posição: ["+ i +"]" + "["+ j +"]:");	
	    		matrixone[i][j] = readpositionsmatrix.nextInt();
	    		
	    	}
	   }
	    
/////////////////////////////////////////////////////////
	    
	    System.out.println("Diagonal principal da primeira matriz");
	    for (int i = 0; i <a ; i++)
	    {
	    	for (int j = 0; j <b; j++)
	    	{
	    		if (i == j)
	    		{
	    			System.out.println("" + matrix[i][j] + "");
	    		}
	    		
	    		else 
	    		{
	    			System.out.print(" * ");
	    		}
	    	}
	    	System.out.print("\n");
	    }
	    
	    System.out.println("Diagonal secudária da primeira matriz");
	    for (int i = 0; i <a ; i++)
	    {
	    	for (int j = 0; j <b; j++)
	    	{
	    		if(j == (a - 1 - i))
	    		{
	    			System.out.print(matrix[i][j]);
	    		}
	    		
	    		else 
	    		{
	    			System.out.print(" * ");
	    		}
	    	}
	    	System.out.print("\n");
	    }
	    
	    
	    System.out.println("Diagonal principal da segunda matriz: ");
	    for (int i = 0; i <c ; i++)
	    {
	    	for (int j = 0; j <d; j++)
	    	{
	    		if (i == j)
	    		{
	    			System.out.println("" + matrixone[i][j] + "");
	    		}
	    		
	    		else 
	    		{
	    			System.out.print(" * ");
	    		}
	    	}
	    	System.out.print("\n");
	    }
	    
	    System.out.println("Diagonal secundária da segunda matriz: ");
	    for (int i = 0; i <c ; i++)
	    {
	    	for (int j = 0; j <d; j++)
	    	{
	    		if(j == (c - 1 - i))
	    		{
	    			System.out.print(matrixone[i][j]);
	    		}
	    		
	    		else 
	    		{
	    			System.out.print(" * ");
	    		}
	    	}
	    	System.out.print("\n");
	    }
	    
	    int [][]transMatrix = new int[b][a];
	    
	    for(int i = 0; i<b; i++)
	    {
	    	for(int j = 0; j<a; j++)
	    	{
	    		transMatrix[i][j] = matrix[j][i];
	    	}
	    	System.out.print("\n");
	    }
	    
	    System.out.println("Resultado da matriz transposta de AxB: ");
	    for(int i = 0; i<b; i++)
	    {
	    	for(int j = 0; j<a; j++)
	    	{
	    		System.out.print(matrixone[i][j]);
	    	}
	    	System.out.print("\n");
	    }
	    
int [][]transMatrixOne = new int[d][c];
	    
	    for(int i = 0; i<d; i++)
	    {
	    	for(int j = 0; j<c; j++)
	    	{
	    		transMatrixOne[i][j] = matrixone[j][i];
	    	}
	    	System.out.print("\n");
	    }
	    
	    System.out.println("Resultado da matriz transposta de CxD: ");
	    for(int i = 0; i<d; i++)
	    {
	    	for(int j = 0; j<c; j++)
	    	{
	    		System.out.print(transMatrixOne[i][j]);
	    	}
	    	System.out.print("\n");
	    }
	    
	    int [][]sumTheMatrix = new int[a][b];
	    if((a==c)&&(b==d))
	    {
	    	for(int i=0; i<a; i++)
	    	{
	    		for(int j=0; j<b; j++)
	    		{
	    			sumTheMatrix[i][j]= matrix[i][j]+matrixone[i][j];
	    		}
	    	}
	    }
	    else
	    {
	    	System.out.println("Não é possível realizar a soma!!");
	    }
	    
	    System.out.println("Soma das matrizes: ");
	    for(int i=0; i<a; i++)
	    {
	    	for(int j=0; j<b; j++)
	    	{
	    		System.out.print(sumTheMatrix[i][j]);
	    	}
	    	System.out.print("\n");
	    }
	    
	    
	    int [][]multiplicationMatrix = new int[a][d];
	    
	     if(b==c)
	     {
	    	 for(int i=0; i<a; i++)
	    	 {
	    		for(int j=0; j<d; j++)
	    		{
	    			for (int k=0; k<b; k++)
	    			{
	    				multiplicationMatrix[i][k] += matrix[i][k]*matrixone[k][j];
	    			}
	    		}
	    	 }
	     }
	     else
	     {
	    	 System.out.println("Não é possível realizar a Multiplicação!!");
	     }
	     
	     System.out.println(" Multiplicação das matrizes: ");
	     for(int i=0; i<a; i++)
	     {
	    	 for(int j=0; j<d; j++)
	    	 {
	    		 System.out.print(multiplicationMatrix[i][j]);
	    	 }
	    	 System.out.print("\n");
	     }
	     
	     
	}
	
	
	
	
	
	
	
	
	
}

