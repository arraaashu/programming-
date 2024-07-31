def linear(arr,i):
    for item in arr:
        if item is i:
            return arr.index(item)

if __name__ == "__main__":
    arr = [1,5,4,6,7,8]
    print(linear(arr,7))



def binary(arr,i,begin,end):
    mid = begin+end // 2
    if arr[mid] is i:
        return mid
    elif arr[mid] > i:
        binary(arr,i,0,mid-1)
    else:
        binary(arr,i,mid+1,0)

if __name__ == "__main__":
    arr=[1,2,3,4,5,6]
    print(binary(arr,4,0,6))    