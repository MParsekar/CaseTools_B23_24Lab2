def Fibo(iterations):
    previous = 0
    current = 1
    
    print(f"{previous} {current}", end=' ')
    for i in range(iterations-2):
        nextnumber = previous + current
        print(nextnumber, end=' ')
        previous = current
        current = nextnumber
    
    print()

Fibo(int(input("Enter the number of iterations: ")))