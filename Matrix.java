public class Matrix {
    
    int [][] matrix ; 
    int size;
    
    public Matrix(int size){
        
        matrix = new int[size][size];
        this.size = size; 
        
         for(int i=0; i< matrix.length; i++){
            
            for(int j=0; j< matrix.length; j++ ){
                
                matrix[i][j] = 0 ; 
            }
            
        }
        
        
        
    }
    
    
    private void swap(int x1, int y1, int x2, int y2){
        
        int temp = matrix[x1][y1];
        
        matrix[x1][y1] = matrix[x2][y2] ;
        matrix[x2][y2] = temp;
        
    }
    
    
    public void printMatrix(){
        
        
        System.out.println();
        for(int i=0; i< matrix.length; i++){
            
            for(int j=0; j< matrix.length; j++ ){
                
                System.out.print(matrix[i][j]+"   ");
            }
            System.out.println();
        }
    }
    
    
    public void populateMatrix(){
        
        
        int start=1;
        for(int i=0; i< matrix.length; i++){
            
            for(int j=0; j< matrix.length; j++ ){
                
                matrix[i][j] = start;
                start++;
            }
            
        }
        
        
    }
    
    
    public void flipMatrix(){
        
        
    }
    
    
    
    

}
