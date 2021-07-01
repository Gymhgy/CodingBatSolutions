# List-2
# Return the "centered" average of an array of ints, which we'll say is the mean average of the values, except ignoring the largest and smallest values in the array. If there are multiple copies of the smallest value, ignore just one copy, and likewise for the largest value. Use int division to produce the final average. You may assume that the array is length 3 or more.
# Problem Source: https://codingbat.com/prob/p126968
def centered_average(nums):
  return sum(sorted(nums)[1:-1])//(len(nums)-2)
