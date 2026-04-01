# ☕ LeetCode Problem Solving Repository (Java)

Welcome to my LeetCode problem-solving repository! 🚀
This repository contains solutions to various LeetCode problems implemented in **Java**, with a focus on clean code, efficiency, and interview preparation.

---

## 📌 About

* Platform: https://leetcode.com/
* Language: **Java**
* Focus Areas:

  * Data Structures
  * Algorithms
  * Problem-solving patterns
  * Coding interview preparation

---

## 📂 Folder Structure

```id="x2m7qp"
📦 leetcode-solutions-java
 ┣ 📂 Arrays
 ┣ 📂 Strings
 ┣ 📂 LinkedList
 ┣ 📂 Trees
 ┣ 📂 Graphs
 ┣ 📂 DynamicProgramming
 ┣ 📂 Backtracking
 ┣ 📂 Greedy
 ┗ 📂 Misc
```

Each folder contains:

* Java solution files
* Well-commented code
* Optimized approaches (whenever possible)

---

## 🧩 Problem Format

Each solution typically includes:

* ✅ Problem Name
* 🔢 Difficulty (Easy / Medium / Hard)
* 🧠 Approach / Explanation
* ⏱ Time Complexity
* 💾 Space Complexity
* 💻 Java Code Implementation

---

## 🚀 Example

**Problem:** Two Sum
**Difficulty:** Easy

**Approach:**
Use a HashMap to store visited elements and check for the complement.

**Code (Java):**

```java id="n4k8zs"
import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            
            if (map.containsKey(diff)) {
                return new int[] { map.get(diff), i };
            }
            
            map.put(nums[i], i);
        }
        
        return new int[] {};
    }
}
```

---

## 🎯 Goals

* Strengthen DSA concepts using Java
* Write clean and optimized code
* Improve problem-solving consistency
* Prepare for technical interviews

---

## 🛠 How to Use

1. Clone the repository
2. Navigate through topic-wise folders
3. Attempt problems before viewing solutions
4. Analyze approaches and optimize further

---

## 🤝 Contribution

Contributions are welcome!

* Fork the repository
* Add your Java solution
* Create a pull request

---

## ⭐ Support

If you find this repository helpful, consider giving it a ⭐!

---

Happy Coding! 💻🔥
