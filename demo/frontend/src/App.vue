<script setup>
import { ref, onMounted } from 'vue'

const fullInfo = ref('')
const userName = ref('')

// onMounted(async () => {
//   const res = await fetch('http://localhost:9090/api/test/69')
//   //message.value = await res.text()
// })

async function getFullInfo() {

  if (userName.value === '')
    return fullInfo.value = "Common provide your name";
  const res = await fetch('http://localhost:9090/api/getFullInfo/' + userName.value)
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
    <input v-model="userName" placeholder="Dein Name" />
    <button @click="getFullInfo">Senden</button>
  </div>
</template>