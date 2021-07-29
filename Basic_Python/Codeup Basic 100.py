#!/usr/bin/env python
# coding: utf-8

# In[3]:


a="\"C:\\Download\\'hello'.py\""
print(a)


# In[5]:


a="print(\"Hello\\nWorld\")"
print(a)


# In[6]:


c=input()
print(c)


# In[7]:


print(int(input()))


# In[8]:


print(float(input()))


# In[10]:


s = input()
print(s, s, s)


# In[13]:


a, b = input().split(':')
print(a, b, sep=':')


# In[14]:


a, b, c = input().split('.')
print(c, b, a, sep='-')


# In[15]:


a, b = input().split('-')
print(a+b)


# In[25]:


s = input()
print(s[0])
print(s[1])
print(s[2])
print(s[3])
print(s[4])


# In[27]:


s=input()
print(s[0:2]+' '+s[2:4]+' '+s[4:])


# In[28]:


s=input().split(":")
print(s[1])


# In[30]:


s=input().split(" ")
print(s[0]+s[1])


# In[31]:


a, b = input().split()
c = int(a) + int(b)
print(c)


# In[35]:


a=float(input())
b=float(input())
print(a+b)


# In[36]:


n=int(input())
print('%x'%n)


# In[37]:


n=int(input())
print('%X'%n)


# In[38]:


a=input()
n=int(a,16)
print('%o'%n)


# In[39]:


n = ord(input())
print(n)


# In[43]:


i=int(input())
c=chr(i)
print(c)


# In[44]:


n=int(input())
print(-n)


# In[2]:


n=ord(input())
print(chr(n+1))


# In[3]:


a,b=input().split(' ')
print(int(a)-int(b))


# In[4]:


a,b=input().split(' ')
print(float(a)*float(b))


# In[5]:


a,b=input().split(' ')
print(a*int(b))


# In[7]:


a=input()
b=input()
print(b*int(a))


# In[8]:


a,b=input().split(' ')
print(int(a)**int(b))


# In[9]:


a,b=input().split(' ')
print(float(a)**float(b))


# In[10]:


a,b=input().split(' ')
print(int(a)//int(b))


# In[11]:


a,b=input().split(' ')
print(int(a)%int(b))


# In[12]:


a=float(input())
print( format(a, ".2f") )


# In[15]:


a,b=input().split(' ')
print( format(float(a)/float(b), ".3f") )


# In[16]:


a,b=input().split(' ')
print(int(a)+int(b))
print(int(a)-int(b))
print(int(a)*int(b))
print(int(a)//int(b))
print(int(a)%int(b))
print(format(int(a)/int(b),".2f"))


# In[21]:


a,b,c=input().split(' ')
sum=int(a)+int(b)+int(c)
print(str(sum)+' '+str(format(sum/3,".2f")))


# In[23]:


a=input()
print(int(a)<<1)


# In[24]:


a,b=input().split(' ')
print(int(a)<<int(b))


# In[25]:


a,b=input().split(' ')
print(int(a)<int(b))


# In[26]:


a,b=input().split(' ')
print(int(a)==int(b))


# In[27]:


a,b=input().split(' ')
print(int(a)<=int(b))


# In[28]:


a,b=input().split(' ')
print(int(a)!=int(b))


# In[29]:


n = int(input())
print(bool(n))


# In[32]:


n = int(input())
print(not bool(n))


# In[36]:


a,b=input().split(' ')
print(bool(int(a)) and bool(int(b)))  


# In[37]:


a,b=input().split(' ')
print(bool(int(a)) or bool(int(b))) 


# In[39]:


a,b=input().split(' ')
if(bool(int(a))!=bool(int(b))):
    print(True)
else :
    print(False)


# In[40]:


a,b=input().split(' ')
if(bool(int(a))==bool(int(b))):
    print(True)
else :
    print(False)


# In[41]:


a,b=input().split(' ')
if(not bool(int(a)) and not bool(int(b))):
    print(True)
else :
    print(False)


# ###### 비트단위논리연산

# In[42]:


a=int(input())
print(~a)


# In[48]:


a,b=input().split(' ')
print(int(a) & int(b))


# In[52]:


a,b=input().split(' ')
print(int(a) | int(b))


# In[53]:


a,b=input().split(' ')
print(int(a) ^ int(b))


# In[54]:


a,b=input().split(' ')
if(int(a)>int(b)):
    print(int(a))
else :
    print(int(b))


# ###### 연산자 우선순위

# In[56]:


a=list(map(int,input().split(' ')))
print(min(a))


# In[59]:


a=list(map(int,input().split(' ')))
for i in range(len(a)):
    if(a[i]%2==0):
        print(a[i])


# In[60]:


a=list(map(int,input().split(' ')))
for i in range(len(a)):
    if(a[i]%2==0):
        print('even')
    else:
        print('odd')


# In[61]:


a=list(map(int,input().split(' ')))
for i in range(len(a)):
    if(a[i]%2==0 and a[i]<0):
        print('A')
    elif(a[i]%2!=0 and a[i]<0):
        print('B')
    elif(a[i]%2==0 and a[i]>0):
        print('C')
    else:
        print('D')


# In[65]:


n=int(input())
if n>=90 :
    print('A')
elif n>=70 :
    print('B')
elif n>=40 :
    print('C')
else :
    print('D') 


# In[69]:


n=input()
if n=='A' :
    print('best!!!')
elif n=='B' :
    print('good!!')
elif n=='C' :
    print('run!')
elif n=='D' :
    print('slowly~')
else :
    print('what?') 


# In[71]:


n=int(input())
if n==12 or n<=2 :
    print('winter')
elif n<6 :
    print('spring')
elif n<9 :
    print('summer')
else :
    print('fall')


# In[80]:


n=1
while n!=0 :
    n = int(input())
    if(n!=0):
        print(n)


# In[82]:


n=int(input())
while n!=0 :
    if(n!=0):
        print(n)
    n=n-1


# In[83]:


n=int(input())
while n!=0 :
    n=n-1
    print(n)


# In[103]:


c = ord(input())
t = ord('a')
while t<=c :
  print(chr(t), end=' ')
  t += 1


# In[105]:


n=int(input())
i=0
while i<=n :
    print(i)
    i+=1


# In[106]:


n=int(input())
i=1
sum=0
while i<=n :
    if(i%2==0):
        sum+=i
    i+=1
print(sum)


# In[109]:


while True:
    x=input()
    print(x)
    if x=='q':
        break


# In[123]:


n = int(input()) 
s = 0 
t = 0 
while s<n : 
    t = t+1 
    s = s+t 
print(t)


# In[132]:


n,m=input().split(' ')
n=int(n)
m=int(m)
for i in range(n) :
  for j in range(m) :
    print(i+1, j+1)


# In[11]:


a = int(input(),16)
for i in range(1,16):
    print('%X*%X=%X' %(a,i,a*i))


# In[17]:


a=int(input())
for i in range(1, a+1) :
    if i%3==0 :
        if i==a:
            print("X")
            break
        print("X", end=' ')
    else :
        if i==a:
            print(i)
            break
        print(i, end=' ')


# In[18]:


a = int(input())

for i in range(1,a+1):
    
    if (i%10==3 or i%10==6 or i%10==9):
        print('X',end=' ')
        continue
    
    print(i,end=' ')


# In[2]:


r, g, b = map(int, input().split())
answer = 0
for i in range(r):
  for j in range(g):
    for k in range(b):
      print("%d %d %d" %(i, j, k))
      answer+=1
print(answer)


# In[8]:


h,b,c,s = map(int, input().split())
answer=(h*b*c*s)/8/1024/1024
print( format(answer, ".1f") +" MB")


# In[10]:


w,h,b = map(int, input().split())
answer=(w*h*b)/8/1024/1024
print( format(answer, ".2f") +" MB")


# In[17]:


n= int(input())
i=0
sum=0
while True:
  sum+=i
  i+=1
  if(sum>=n):
     break
print(sum)


# In[22]:


n= int(input())
i=0
while i<n:
    i+=1
    if(i%3!=0):
         print(i,end=" ")


# In[25]:


a,b,n = map(int, input().split())
i=0
for i in range(n):
    if(i==n-1):
        print(a)
    a+=b


# In[26]:


a,b,n = map(int, input().split())
i=0
for i in range(n):
    if(i==n-1):
        print(a)
    a*=b


# In[29]:


a,m,d,n = map(int, input().split())
i=0
for i in range(n):
    if(i==n-1):
        print(a)
    a=a*m+d


# In[32]:


a,b,c = map(int, input().split())
i=0
d=1
while True:
    if(d%a==0 and d%b==0 and d%c==0):
        print(d)
        break
    d+=1


# In[33]:


n = int(input()) 
a = input().split() 
for i in range(n):
    a[i]=int(a[i])
d=[]
for i in range(24):
    d.append(0)
for i in range(n):
    d[a[i]]+=1
for i in range(1,24):
    print(d[i],end=' ')


# In[40]:


n = int(input()) 
a = input().split()
a.reverse()
print(' '.join(a))


# In[50]:


n = int(input()) 
a = input().split()
a = list(map(int, a))
print(min(a))


# In[57]:


d=[]
for i in range(20) :
    d.append([])
    for j in range(20) : 
        d[i].append(0) 
n = int(input())
for i in range(n) :
    x, y = input().split()
    d[int(x)][int(y)] = 1
for i in range(1, 20) :
    for j in range(1, 20) : 
        print(d[i][j], end=' ') 
    print()  


# In[ ]:




