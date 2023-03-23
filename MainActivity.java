package kauan.aluno.testepraticosinfortronicos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        
        a = float(input('Escreva um número: '))
b = float(input('Escreva um número: '))
c = float(input('Escreva um número: '))

if a >= b and a >= c and b >= c:
    print(f'A ordem decrescente é {a} , {b} e {c}')
elif a >= b and a >=c and c >= b:
    print(f'A ordem decrescente é {a} , {c} e {b}')
elif b >= a and b >= c and a >= c:
    print(f'A ordem decrescente é {b} , {a} e {c}')
elif b >= a and b >= c and c >= a:
    print(f'A ordem decrescente é {b} , {c} e {a}')
elif c >= a and c >= b and a >=b:
    print(f'A ordem decrescente é {c} , {a} e {b}')
elif c >= a and c >= b and b >= a:
    print(f'A ordem decrescente é {c} , {b} e {a}')

        
        prod_1 = float(input('Valor 1° produto: '))
prod_2 = float(input('Valor 2° produto: '))
prod_3 = float(input('Valor 3° produto: '))

if prod_1 <= prod_2 and prod_1 <= prod_3:
    print('Compre o primeiro produto.')
elif prod_2 <= prod_3:
    print('Compre o segundo produto.')
else:
    print('Compre o terceiro produto')
        
        
        lista = []
qtd = 3
for i in range(qtd):
    elemento = int(input('Digite um numero: '))
    lista.append(elemento)

lista.sort(reverse = True) 
print(lista)
        
        if a < c:
    a, c = c, a

if a < b:
    a, b = b, a

if b < c:
    b, c = c, b

print(f'A ordem decrescente é {a}, {b} e {c}')
        
        
        
        
        
        
        
        
    }
}
