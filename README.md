# Groovy Each Method Unexpected Null Return

This repository demonstrates a common pitfall in Groovy: the `each` method's unexpected null return value when used for list transformations.  The example shows how to correctly transform a list using `collect`.

## Bug

The `bug.groovy` file contains code that attempts to double each element of a list using the `each` method.  However, `each` modifies the list in place and returns `null`, leading to an unexpected null output.

## Solution

The `bugSolution.groovy` file provides the correct solution using the `collect` method, which returns a new list containing the transformed elements.