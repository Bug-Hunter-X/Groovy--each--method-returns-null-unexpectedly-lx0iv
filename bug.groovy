def list = [1, 2, 3, 4, 5]

println list.each { it * 2 } //Expected output: [2, 4, 6, 8, 10], Actual Output: null

The each method in Groovy returns null instead of the modified list. This is a common mistake when developers expect it to return the modified collection.