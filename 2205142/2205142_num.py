def add_matrices(matrix1, matrix2):
    result = []

    # Check if matrices have the same dimensions
    if len(matrix1) != len(matrix2) or len(matrix1[0]) != len(matrix2[0]):
        return "Matrices must have the same dimensions for addition."

    # Iterate through rows and columns to add corresponding elements
    for i in range(len(matrix1)):
        row_result = []
        for j in range(len(matrix1[0])):
            row_result.append(matrix1[i][j] + matrix2[i][j])
        result.append(row_result)

    return result

def input_matrix():
    rows = int(input("Enter the number of rows: "))
    cols = int(input("Enter the number of columns: "))
    
    matrix = []
    print("Enter matrix elements row-wise:")
    for i in range(rows):
        row = []
        for j in range(cols):
            element = int(input(f"Enter element at position ({i + 1}, {j + 1}): "))
            row.append(element)
        matrix.append(row)

    return matrix

# Input for two matrices
print("Input for Matrix A:")
matrix_a = input_matrix()

print("\nInput for Matrix B:")
matrix_b = input_matrix()

# Addition and output
result_matrix = add_matrices(matrix_a, matrix_b)
print("\nResultant Matrix after addition:")
for row in result_matrix:
    print(row)