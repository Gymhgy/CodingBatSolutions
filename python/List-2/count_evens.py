# List-2
# Return the number of even ints in the given array. Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.
# Problem Source: https://codingbat.com/prob/p189616
def count_evens(nums):
  return sum(1-x%2 for x in nums)
