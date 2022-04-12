class intro:
    def message(self,mess,number,arr):
        print(sorted(arr))
        return("your message -- "+mess+"you code is---"+number)

if __name__ == '__main__':
    arr = [5,6,8,1,2,3]
    newmess = intro()
    print(newmess.message("hi there","46",arr))