print ("To add two matrices of same order")
lst1=[]
lst2=[]
r1=int(input("enter the no of rows:"))
c1=int(input("enter the no of columns:"))
r2=int(input("enter the no of rows of second matrix:"))
c2=int(input("enter the no of columns of second matrix:"))
for i in range(r1):
  row1=[]
  for j in range(c1):
    elemnt1=int(input("enter the element"))
    row1.append(elemnt1)
  lst1.append(row1)
print(lst1)
#entering the elements of second matrix  
for i in range(r2):
  row2=[]
  for j in range(c2):
    elemnt2=int(input("Enter the element"))
    row2.append(elemnt2)
  lst2.append(row2)
print(lst2)
 #adding the two matrices
lst3=[]
for i in range(r1):  
  row3=[]  
  for j in range(c2):
    elemnt3=lst1[i][j] + lst2[i][j]
    row3.append(elemnt3)
  lst3.append(row3)
print("The resultant")
print(lst3)