def list = [1, 2, 3, 4, 5]

println list.collect { it * 2 } // Correct: Returns the modified list [2, 4, 6, 8, 10]

//Alternative using each and a new list
def newList = []
list.each { newList << it * 2 }
println newList //Correct: Returns the modified list [2, 4, 6, 8, 10]