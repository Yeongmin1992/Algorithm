data_list = [0, 1, 2]

for i in range(3, 1001):
    data_list.append(data_list[i - 1] + data_list[i - 2])
n = int(input())
print(data_list[n] % 10007)