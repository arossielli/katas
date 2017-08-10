if __name__=='__main__':
    row = int(raw_input('Ingresar el nro de de filas: '))
    x = 1

for i in range(1, row + 1):
    st = ''
    for j in range(i):
        st = st + ' ' + str(x)
        x += 1
    print st
