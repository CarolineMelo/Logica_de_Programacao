N = int(input("Quantos números você vai digitar? "))

vet:[float]=[0 for x in range(N)]

for i in range(0,N):
    vet[i] = float(input("Digite um número: "))

print()
print("Número digitados: ")
for i in range(0,N):
    print(f"{vet[i]:.1f}")
