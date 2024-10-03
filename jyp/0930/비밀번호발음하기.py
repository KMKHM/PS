import sys
sys.stdin = open("input.txt")

input = sys.stdin.readline

vowel_list = ['a', 'e', 'i', 'o', 'u']
vowel_continuous_list = ['e', 'o']

def validation_vowel_check(target):
    return any(char in vowel_list for char in target)

def validation_continuous_word_3(target):
    vowel_count = 0
    consonant_count = 0

    for i in range(len(target)):
        if target[i] in vowel_list:
            vowel_count += 1
            consonant_count = 0
        else:
            consonant_count += 1
            vowel_count = 0

        if vowel_count >= 3 or consonant_count >= 3:
            return False
    return True

def validation_continuous_word_2(target):
    for i in range(1, len(target)):
        if target[i] == target[i-1] and target[i] not in vowel_continuous_list:
            return False
    return True

while True:
    target = input().strip()
    if target == "end":
        break

    if validation_vowel_check(target) and validation_continuous_word_3(target) and validation_continuous_word_2(target):
        print(f'<{target}> is acceptable.')
    else:
        print(f'<{target}> is not acceptable.')
