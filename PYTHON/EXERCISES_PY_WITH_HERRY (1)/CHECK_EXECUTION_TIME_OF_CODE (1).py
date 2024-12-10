import time

start_time=time.time()
for i in range(33):
    print("Hello")
    time.sleep(0.003)
print(time.time()-start_time)

print(time.asctime(time.localtime(time.time())))






