import { get, post } from '@/utils/request'

export const saveUser = (options) => {
    return post('/adUser', options);
}