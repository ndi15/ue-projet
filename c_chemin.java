 //j'ecris ici tous les import 
 import java.util.*;
 public class c_chemin{
    public static Pile<maillon> chemin_court(boolean[][] M , int x1,int y1,int x2,int y2){
        int n=M.length ; 
        //la file qui contient l'ensemble des points possibles vers le cible
        File<pile<maillon>> F=nex LinkedList<>();
        //l'ensemble des points visites 
        HashSet<maillon> V =new HashSet<>();
        //initialisation
        pile<maillon> debut =new pile<>();
        //j'empile la position de depart du chemin 
        debut.empiler(new maillon(x1,y1));
        F.enfiler(debut);//represente mon premier chemin 
        
        
        
        //directions :droite , gauche, bas , haut 
        int[][] dir={ {1,0},{-1,0},{0,1},{0,-1}};
         
         // boucle principale
         while(!F.isEmpty()){
           Pile<maillon> c=F.depiler();//je depile le premier chemin 
          maillon tete=c.sommet(); //je retire le sommet du chemin 
          int x=tete.getmaillon_x;
          int y=tete.getmaillon_y;
          
          
          //je verifie si avec ce chemin on a arriver au cible 
          if(x==x2 && y==y2){
             return c;
             }
             
           //verifications
           if(x<0 ||x>=n ||  y<0 || y>=n){ continue;}
           if(!M[x][y]){ continue;}
           //est ce que j'avais passer a ce point
           if(V.contains(tete)){ continue;}    
           V.add(tet);//comme c'est non je l'ajoute 
           
           //comme j'ai pas atteint le cible j'ajoute quatre directions possible de passer pour atteindre le cible 
           for( int[] d:dir){
              int nx=x+d[0];
              int ny=y+d[1];
              
              pile<maillon> copier=c.copie(); 
              copie.empiler(new maillon(nx,ny));
              F.enfiler(copie);
              }
              }
              
              return new Pile<>();
              }
              }
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
           
