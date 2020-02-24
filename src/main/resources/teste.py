import math

def extractValue(n):
  return n.value.doubleValue()

data = filter(lambda d : d.code == cliente, data)
totalValue = sum(map(extractValue, data))

if totalValue > 50:
   result = totalValue * 1.4
else:
   result = totalValue