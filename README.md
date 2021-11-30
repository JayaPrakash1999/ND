# ND
Implemntation of Fast Hierarchy Construction for Dense Subgraphs 

# Steps:
1. Make sure the system has latest version of Java
2. Run the **Main.java** using any IDE or command prompt.

3. The input file contains the edges of the input graph and each line in the input file indicates the vertex of the graph such that 2 lines together forms the edge.

**Note:-** If there are N vertices(lines) in the input file, it means: the number of edges in the input graph is : N/2

            All the input files are executed iteratively, So no need of modifying the inpuit file every time.
            
            i.e Each Input file includes the edges of a graph
             
**Outputs** from this project result in a set of subgraphs with certain Lamda values which are then used in the construction of the Hierarchy skeleton.

4. Hierarchy skeleton is represented by Adjacency List, which is the final output

5. The output of all input files is stored in the output.txt file

**NOTE**  Input4.txt is the dataset took from https://github.com/athomo/kcore/blob/master/simplegraph.txt with around 50 edges.
       
          Input5.txt contains the 101 edges


Graph and Skeleton Structure for input3.txt file :
![image](https://user-images.githubusercontent.com/51074340/143935006-d052e646-a33d-4b80-a869-6cbd6a8a0c77.png)
