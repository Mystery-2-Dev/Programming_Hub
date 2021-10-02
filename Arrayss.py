public class Arrayss:
    def rotateSubArray(self, arr, l, r):
        temp = arr[r]
        for j in range(r, l-1, -1):
            arr[j] = arr[j-1]
        arr[l] = temp

        return arr

    def moveNegative(self, arr):

        last_negative_index = -1

        for i in range(len(arr)):
            if arr[i] < 0:
                last_negative_index += 1
                arr[i], arr[last_negative_index] = arr[last_negative_index], arr[i]

                # Done to manage order too
                if i - last_negative_index >= 2:
                    self.rotateSubArray(arr, last_negative_index+1, i)

        return arr


#  Driver Code
if __name__ == '__main__':
    arr = [5, 5, -3, 4, -8, 0, -7, 3, -9, -3, 9, -2, 1]
    ob = Solution()
    ob.moveNegative(arr)
    for i in arr:
        print(i, end=' ')
    print()
