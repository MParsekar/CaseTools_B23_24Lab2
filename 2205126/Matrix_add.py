def mat_add(mat1, mat2):
    mat3 = []
    row = len(mat1)
    col = len(mat1[0])
    
    if len(mat1) == len(mat2) and len(mat1[0]) == len(mat2[0]):
        for i in range(row):
            mat3.append([])
            for j in range(col):
                mat3[i].append(mat1[i][j] + mat2[i][j])
        return mat3
    
    return "Dimensions are not same"

lst1 = [[1,2,3],
        [4,5,6]]

lst2 = [[6,5,4],
        [3,2,1]]

mat3 = mat_add(lst1,lst2)

for row in range(len(mat3)):
    print(mat3[row])