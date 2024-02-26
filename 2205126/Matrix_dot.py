def mat_dot(mat1, mat2):
    mat3 = []
    row = len(mat1)
    col = len(mat2[0])
    
    if len(mat1[0]) == len(mat2):
        for i in range(row):
            mat3.append([])
            for j in range(col):
                sum = 0
                for k in range(len(mat2)):
                    sum+= mat1[i][k] * mat2[k][j]
                mat3[i].append(sum)
        return mat3
    
    return "col of mat1 != row of mat2"

lst1 = [[3,4],
        [7,2],
        [5,9]]

lst2 = [[3,1,5],
        [6,9,7]]

mat3 = mat_dot(lst1,lst2)

for row in range(len(mat3)):
    print(mat3[row])