public class maillon{
        int x ; //corrdonne x 
        int y;//coordonnes y 
        
        
     
        // constructeur 
        maillon(int c,int v){
                this.x=c;
                this.y=v;
            
                 
                }
             public int  getmaillonx(){
                   return this.x;
                }
             public  int getmaillony(){
                    return this.y;
                    }
              
                    @Override 
                public boolean equals(Object o){
                     if(!( o instanceof maillon)){
                           return false;
                           }
                           
                         maillon c =(maillon) o ; 
                         return x==c.x &&y==c.y;
                         }
                    @Override
                     public int hashCode(){
                        return x*31 +y;
                        }
                        }
                  
                
           
