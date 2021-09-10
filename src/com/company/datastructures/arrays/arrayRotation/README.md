# Program for array rotation
#### Difficulty Level : Easy

 
### Write a function rotate(ar[], d, n) that rotates arr[] of size n by d elements. 

#### Solution1: Using temp array
```
1. Store the first d elements in a temp array.
2. Shift rest of the array to left by d elements.
3. Copy d elements in temp to the end of the original array.
```

#### Solution2: Using reverse technique
```
1. Reverse first d elements of the array
2. Reverse rest of the array
3. Reverse the whole array
```

#### Solution1: GCD technique (Most efficient)
```
1. Divide the array in gcd(n,d) parts
2. Shift the elements one by one gcd times.
```