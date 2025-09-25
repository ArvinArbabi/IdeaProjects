import Foundation

var array = [1, 2, 3, 4, 5]

var left = 0
var right = array.count - 1

func searcher(array: [Int], left: Int, right: Int, target: Int) -> Int {
    if left > right { return -1 }
    let mid = left + (right - left) / 2
    if array[mid] == target { return mid }
    if array[mid] < target {
        return searcher(array: array, left: mid + 1, right: right, target: target)
    } else {
        return searcher(array: array, left: left, right: mid - 1, target: target)
    }
}

print(left)
print(right)
print(searcher(array: array, left: left, right: right, target: 3))

