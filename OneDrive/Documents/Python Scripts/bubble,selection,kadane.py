# -*- coding: utf-8 -*-
"""
Created on Fri Jul 26 18:50:50 2024

@author: arraa
"""

def bubble_sort(arr):
    for i in range(len(arr)-1):
        for j in range(len(arr)-1):
            if(arr[j]>arr[j+1]):
                arr[j],arr[j+1] = arr[j+1],arr[j]
    return arr
if __name__ == "__main__":
    arr=[11,55,33,77,22]
    #print(bubble_sort(arr))
    
    
def selection_sort(arr):
    for i in range(len(arr)):
        min_index = i
        for j in range(i+1,len(arr)):
            if(arr[min_index]>arr[j]):
                min_index=j
        if min_index!=i:
            arr[min_index],arr[i] = arr[i],arr[min_index]
    return arr

if __name__ == "__main__":
    arr=[11,55,33,77,22]
    #print(selection_sort(arr))    
    
    
def kadane_algo(arr):
    present_sum = 0
    total = 0
    for i in arr:
        present_sum+=i
        if present_sum > total:
            total=present_sum 
        if present_sum < 0:
            present_sum=0
    return total

if __name__ == "__main__":
    arr=[-1,-4,5,-2,3,4,5,6]
    print(kadane_algo(arr))
