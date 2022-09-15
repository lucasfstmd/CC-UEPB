#!/usr/bin/env python
# coding: utf-8

# In[3]:


numero = input()
print("O número informado foi", numero)


# In[13]:


numero1 = int(input("Digite o primeiro numero: "))
numero2 = int(input("Digite o segundo numero: "))

print("A soma dos numeros foi:", numero1 + numero2)


# In[11]:


nota1 = float(input("Digite a 1 nota do Bimestre: "))
nota2 = float(input("Digite a 2 nota do Bimestre: "))
nota3 = float(input("Digite a 3 nota do Bimestre: "))
nota4 = float(input("Digite a 4 nota do Bimestre: "))

print("Sua media foi: ", (nota1 + nota2 + nota3 + nota4)/4)


# In[29]:


valorM = float(input("Digite o valor em metros: ")) 

print("O valor em centimetros é:", valorM * 100)


# In[18]:


raio = float(input("Digite o valor do raio: "))

print("A area do circulo foi: ", raio ** 2 * 3.14)


# In[19]:


base = float(input("Digite a base: "))
altura = float(input("Digite a altura: "))

print("O dobro desta area foi: ", (base * altura) * 2)


# In[20]:


ganhoHora = float(input("Digite quanto voce ganha por hora: "))
horasMeses = float(input("Digite quantas horas voce trabalha por mes: "))

print("Voce ganha por mes: ", horasMeses * ganhoHora)


# In[25]:


temperaturaF = int(input("Digite a temperatura em Farenheit: "))

print("A temperatura em celsius: ", (5 * (temperaturaF - 32) / 9))


# In[28]:


temperaturaC = int(input("Digite a temperatura em Celsius: "))

print("A temperatura em Farenheit: ", (temperaturaC * 1.8 + 32))


# In[ ]:




