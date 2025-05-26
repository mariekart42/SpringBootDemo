<script setup>
import { ref, onMounted } from 'vue'

const fullInfo = ref('')
const userName = ref('')
const password = ref('')

// onMounted(async () => {
//   const res = await fetch('http://localhost:9090/api/test/69')
//   //message.value = await res.text()
// })

async function getFullInfo() {

  if (userName.value === '')
    return fullInfo.value = "Common provide your name";
  if (password.value === '')
    return fullInfo.value = "Common provide your password";
  const res = await fetch('http://localhost:9090/api/getFullInfo/' + userName.value + '/' + password.value)
  fullInfo.value = await res.text()

  // const res = await fetch('http://localhost:9090/api/setProfile', {
  //   method: 'POST',
  //   headers: { 'Content-Type': 'application/json' },
  //   body: JSON.stringify({ name: userName.value })
  // })
  // message.value = await res.text()
  // alert(text)
}
</script>

<template>
  <div>
    <h1>{{ fullInfo }}</h1>
    <input v-model="userName" placeholder="Your Name" /><br>
    <input v-model="password" placeholder="Your PW" /><br>
    <button @click="getFullInfo">Senden</button>
  </div>
</template>