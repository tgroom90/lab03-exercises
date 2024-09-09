def find_duplicates_nested_loop(l: list) -> list:
    results = list()
    for i in range(len(l)):
        num = l[i]
        duplicate = False
        for j in range(i + 1, len(l)):
            if num == l[j]:
                duplicate = True
                break
        if duplicate and num not in results:
            results.append(num)
    return results

if __name__ == "__main__":
    sample1 = [3, 7, 5, 6, 7, 4, 8, 5, 7, 66]
    sample2 = [3, 5, 6, 4, 4, 5, 66, 6, 7, 6]
    sample3 = [3, 0, 5, 1, 0]
    sample4 = [3]
    
    print("Sample 1:", find_duplicates_nested_loop(sample1))
    print("Sample 2:", find_duplicates_nested_loop(sample2))
    print("Sample 3:", find_duplicates_nested_loop(sample3))
    print("Sample 4:", find_duplicates_nested_loop(sample4))